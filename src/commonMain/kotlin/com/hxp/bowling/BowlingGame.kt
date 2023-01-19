package com.hxp.bowling

class BowlingGame {

    private var scores: List<Int>

    constructor(scores: List<Int>){
        this.scores = scores
    }

    fun score(): Int {
        val score = scores.sum()
        return 0
    }

}
