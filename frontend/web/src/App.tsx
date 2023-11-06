import { Route, Routes } from 'react-router-dom'
import { Layout } from './layout/Layout'
import { ProductsPage } from './features/products/ProductsPage'

export const App = () => {
  return (
    <Routes>
      <Route path='/' element={<Layout />}>
        <Route path='/' element={<ProductsPage />} />
        <Route path='products' element={<ProductsPage />} />
      </Route>
    </Routes>
  )
}
