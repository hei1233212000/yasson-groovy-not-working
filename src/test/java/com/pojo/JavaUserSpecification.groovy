/*
 * (c) 2017 by Harry Chan
 * All rights reserved. No part of this document may be reproduced or
 * transmitted in any form or by any means, electronic, mechanical,
 * photocopying, recording, or otherwise, without prior written
 * permission of Harry Chan.
 */

package com.pojo

import spock.lang.Specification

import javax.json.bind.JsonbBuilder

class JavaUserSpecification extends Specification {
    def 'Convert To Json'() {
        expect:
        def user = new JavaUser(
            name: 'Peter',
            age: 18
        )
        def result = JsonbBuilder.create().toJson(user)
        printf "result: $result"
        assert result == '{"age":18,"name":"Peter"}'
    }
}
