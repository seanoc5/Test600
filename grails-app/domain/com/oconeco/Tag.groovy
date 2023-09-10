package com.oconeco

class Tag {
    String label
    
    static belongsTo = [topic:Topic]

    static constraints = {
    }
}
