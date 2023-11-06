//
// Automatically generated by
//     ____________ 
//    / __/_  __/ / 
//   / _/  / / / /__
//  /_/   /_/ /____/            
//
import { toQueryString } from "./utils";
export interface Address {
  streetAddress: string;
  city: string;
  state: string;
  country: string;
  zipCode: number;
}

export interface CreditCardInfo {
  number: string;
  cVV: number;
  expirationYear: number;
  expirationMonth: number;
}

export interface PlaceOrderRequest {
  userID: string;
  userCurrency: string;
  address: Address;
  email: string;
  creditCard: CreditCardInfo;
}

export interface Money {
  currencyCode: string;
  units: number;
  nanos: number;
}

export interface Item {
  productID: string;
  quantity: number;
}

export interface OrderItem {
  item: Item;
  cost: Money;
}

export interface Order {
  id: string;
  shippingTrackingID: string;
  shippingCost: Money;
  shippingAddress: Address;
  items: OrderItem[];
}


export class CheckoutClient {
  private baseUrl: string;

  constructor(baseUrl: string) {
    this.baseUrl = baseUrl;
  }

  public async placeOrder(request: PlaceOrderRequest): Promise<Order> {
    const response = await fetch(`${this.baseUrl}/checkout`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(request),
    });if (!response.ok) {
      throw new Error(`Error: ${response.status}`);
    }

    return response.json();
  }

}
