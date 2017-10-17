/*
 * (c) 2017 by Harry Chan
 * All rights reserved. No part of this document may be reproduced or
 * transmitted in any form or by any means, electronic, mechanical,
 * photocopying, recording, or otherwise, without prior written
 * permission of Harry Chan.
 */

package com.pogo

import spock.lang.Specification

import javax.json.bind.JsonbBuilder

class UserSpecification extends Specification {
    def 'Convert To Json'() {
        expect:
        def user = new User(
            name: 'Peter',
            age: 18
        )
        def jsonb = JsonbBuilder.create()
        def result = jsonb.toJson(user)
        printf "result: $result"
    }
}
