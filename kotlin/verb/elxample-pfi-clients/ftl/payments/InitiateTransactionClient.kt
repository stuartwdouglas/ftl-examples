package ftl.payments

import ftl.builtin.Empty
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="initiateTransaction",
  module="payments",
)
public interface InitiateTransactionClient : VerbClient<WidenedInitiateTransactionRequest, Empty> {
  public override fun call(`value`: WidenedInitiateTransactionRequest): Empty
}
