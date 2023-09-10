package com.oconeco

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TagSpec extends Specification implements DomainUnitTest<Tag> {

     void "test domain constraints"() {
        when:
        Tag domain = new Tag(label: 'test')
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
