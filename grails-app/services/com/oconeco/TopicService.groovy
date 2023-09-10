package com.oconeco

import grails.gorm.transactions.Transactional

@Transactional
class TopicService {

    def save(Topic topic) {
        log.info "creating topic: $topic"

        //TODO: Call third-party valuation API
        topic.save(flush: true, failOnError: true)
    }
}
