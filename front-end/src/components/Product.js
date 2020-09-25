import React from 'react'
import {Image,Icon,Button} from 'semantic-ui-react'
import Coke from '../image/Coke.png';

class Product extends React.Component{
    constructor(){
        super();
        this.state={
            id:"",
            name:"可乐",
            price:"3",
            unit:"瓶",
            url:Coke,
        }  
    }

    render(){
        return <div>
            <Image src={Coke} size='small'></Image>
            <div>{this.name}</div>
            <div>`单价:${this.price}元/${this.unit}`</div>
            <Icon name="plus cart" />
            <Icon  name='users' />
            <Button> <Icon name="plus cart" /> </Button>

        </div>
    }
}
export default Product;