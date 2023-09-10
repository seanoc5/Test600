package com.oconeco

class Topic {
    String label

    static hasMany = [tags:Tag]

    static constraints = {
    }
}
