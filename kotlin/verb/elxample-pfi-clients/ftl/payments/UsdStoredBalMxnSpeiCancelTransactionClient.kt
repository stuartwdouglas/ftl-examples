package ftl.payments

import ftl.builtin.Empty
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="usdStoredBalMxnSpeiCancelTransaction",
  module="payments",
)
public interface UsdStoredBalMxnSpeiCancelTransactionClient :
    VerbClient<WidenedUsdStoredBalMxnSpeiCancelTransactionRequest, Empty> {
  public override fun call(`value`: WidenedUsdStoredBalMxnSpeiCancelTransactionRequest): Empty
}
