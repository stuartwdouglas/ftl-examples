package ftl.kcc

import xyz.block.ftl.VerbClientDefinition
import xyz.block.ftl.VerbClientSink

@VerbClientDefinition(
  name="authorizePreAuthCode",
  module="kcc",
)
public interface AuthorizePreAuthCodeClient : VerbClientSink<AuthorizePreAuthCodeRequest> {
  override fun call(`value`: AuthorizePreAuthCodeRequest)
}
