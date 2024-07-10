package com.bedu.myapplication.model

class Board {
    private val cells = Array(3) {
        arrayOfNulls<Cell>(
            3
        )
    }
    var winner: Player? = null
        private set
    private var state: GameState? = null
    private var currentTurn: Player? = null

    private enum class GameState {
        IN_PROGRESS,
        FINISHED
    }

    init {
        restart()
    }

    fun restart() {
        clearCells()
        winner = null
        currentTurn = Player.X
        state = GameState.IN_PROGRESS
    }

    fun mark(row: Int, col: Int): Player? {
        var playerThatMoved: Player? = null
        if (isValid(row, col)) {
            cells[row][col]!!.value = currentTurn
            playerThatMoved = currentTurn
            if (isWinningMoveByPlayer(currentTurn, row, col)) {
                state = GameState.FINISHED
                winner = currentTurn
            } else {
                flipCurrentTurn()
            }
        }
        return playerThatMoved
    }

    private fun clearCells() {
        for (i in 0..2) {
            for (j in 0..2) {
                cells[i][j] = Cell()
            }
        }
    }

    private fun isValid(row: Int, col: Int): Boolean {
        return if (state == GameState.FINISHED) {
            false
        } else if (isOutOfBounds(row) || isOutOfBounds(col)) {
            false
        } else if (isCellValueAlreadySet(row, col)) {
            false
        } else {
            true
        }
    }

    private fun isOutOfBounds(idx: Int): Boolean {
        return idx < 0 || idx > 2
    }

    private fun isCellValueAlreadySet(row: Int, col: Int): Boolean {
        return cells[row][col]!!.value != null
    }

    private fun isWinningMoveByPlayer(player: Player?, currentRow: Int, currentCol: Int): Boolean {
        return cells[currentRow][0]!!.value == player && cells[currentRow][1]!!.value == player && cells[currentRow][2]!!.value == player || cells[0][currentCol]!!.value == player && cells[1][currentCol]!!.value == player && cells[2][currentCol]!!.value == player || currentRow == currentCol && cells[0][0]!!.value == player && cells[1][1]!!.value == player && cells[2][2]!!.value == player || currentRow + currentCol == 2 && cells[0][2]!!.value == player && cells[1][1]!!.value == player && cells[2][0]!!.value == player
    }

    private fun flipCurrentTurn() {
        currentTurn = if (currentTurn == Player.X) Player.O else Player.X
    }
}