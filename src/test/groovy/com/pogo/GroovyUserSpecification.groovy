package com.pogo

import spock.lang.Specification

import javax.json.bind.JsonbBuilder

class GroovyUserSpecification extends Specification {
    def 'Convert To Json'() {
        expect:
        def user = new GroovyUser(
            name: 'Peter',
            age: 18
        )
        def result = JsonbBuilder.create().toJson(user)
        printf "result: $result"
        assert result == '{"age":18,"name":"Peter"}'
    }
}
