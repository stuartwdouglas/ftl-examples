package ftl.echo

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="echo",
  module="echo",
)
public interface EchoClient : VerbClient<EchoRequest, EchoResponse> {
  public override fun call(`value`: EchoRequest): EchoResponse
}
