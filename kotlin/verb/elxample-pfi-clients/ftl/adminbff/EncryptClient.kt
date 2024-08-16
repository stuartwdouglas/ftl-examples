package ftl.adminbff

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="encrypt",
  module="adminbff",
)
public interface EncryptClient : VerbClient<EncryptRequest, EncryptResponse> {
  public override fun call(`value`: EncryptRequest): EncryptResponse
}
