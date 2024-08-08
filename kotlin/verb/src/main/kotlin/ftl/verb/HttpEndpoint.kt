package ftl.verb

import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam


@Path("/hello")
public class RestEndpoint {

    @POST
    @Path("/{greeting}")
    fun helloHttp(@PathParam("greeting") greeting: String, body: Person ): String {
        return "$greeting ${body.first} ${body.last}"
    }
}




data class Person (val first: String, val last: String, val greeting: String)