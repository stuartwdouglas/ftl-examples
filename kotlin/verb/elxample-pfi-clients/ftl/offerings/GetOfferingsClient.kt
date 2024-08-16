package ftl.offerings

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getOfferings",
  module="offerings",
)
public interface GetOfferingsClient :
    VerbClient<HttpRequest<GetOfferingsRequestBody>, HttpResponse<GetOfferingsResponseBody, TbdexError>>
    {
  public override fun call(`value`: HttpRequest<GetOfferingsRequestBody>):
      HttpResponse<GetOfferingsResponseBody, TbdexError>
}
