package ftl.payments

import ftl.builtin.Empty
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="ledgerInitBalances",
  module="payments",
)
public interface LedgerInitBalancesClient : VerbClient<Empty, WidenedLedgerInitBalancesResponse> {
  public override fun call(`value`: Empty): WidenedLedgerInitBalancesResponse
}
