package ftl.offerings

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getOffering",
  module="offerings",
)
public interface GetOfferingClient : VerbClient<GetOfferingRequest, GetOfferingResponse> {
  public override fun call(`value`: GetOfferingRequest): GetOfferingResponse
}
