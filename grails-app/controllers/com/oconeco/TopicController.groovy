package com.oconeco


class TopicController {

    static scaffold = Topic
    TopicService topicService

    def index() {
    }

    def save(Topic topic) {
//        Topic topic = new Topic(params)
        topicService.save(topic)
//    }
        log.info "Params: $params"

    }
}

