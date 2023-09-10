package com.oconeco

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TagControllerSpec extends Specification implements ControllerUnitTest<TagController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
