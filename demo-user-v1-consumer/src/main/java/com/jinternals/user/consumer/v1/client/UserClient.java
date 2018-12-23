package com.jinternals.user.consumer.v1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${feign.client.name}", url = "${feign.client.url}")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/user/{id}",consumes = MediaType.VND_USER_API_V1, produces = MediaType.VND_USER_API_V1)
    User getUserById(@PathVariable("id") String id);

}
