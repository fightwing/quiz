import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';
import { Icon} from 'semantic-ui-react';
import Products from "./Products";
import Order from "./Order";
import AddProduct from "./AddProduct";


class Header extends React.Component {


  render() {
    return (
      <BrowserRouter>
        <div className="hander">
          <ul>
            <li>
              <Link to="./Products">
                <Icon name="home" />
                商城
              </Link>
            </li>
            <li>
              <Link to="./Order">
                <Icon name="shopping cart" />
                订单
              </Link>
            </li>
            <li>
              <Link to="./AddProduct">
                <Icon name="plus" />
                添加商品
              </Link>
            </li>
          </ul>
          <Route path="/Products" component={Products}></Route>
          <Route path="/Order" component={Order}></Route>
          <Route path="/AddProduct" component={AddProduct}></Route>
        </div>
      </BrowserRouter>
    );
  }
}

export default Header;
