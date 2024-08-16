package ftl.payments

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="usdSquareMxnSpeiCreatePendingTransaction",
  module="payments",
)
public interface UsdSquareMxnSpeiCreatePendingTransactionClient :
    VerbClient<WidenedUsdSquareMxnSpeiCreatePendingTransactionRequest, WidenedUsdSquareMxnSpeiCreatePendingTransactionResponse>
    {
  public override fun call(`value`: WidenedUsdSquareMxnSpeiCreatePendingTransactionRequest):
      WidenedUsdSquareMxnSpeiCreatePendingTransactionResponse
}
