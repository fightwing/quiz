import React from 'react';
import { Form, Input, InputNumber,Button } from 'antd';

const URL = "http://localhost:8080/product"
class AddProduct extends React.Component{
    constructor(props){
        super(props);
        this.submitInfo = (data) => {
            fetch(URL,{
                body: JSON.stringify(data),
                headers: {
                "content-type": "application/json",
                },
                cache: "no-cache",
                credentials: "same-origin",
                method: "POST",
                mode: "cors",
                redirect: "follow",
                referrer: "no-referrer",
        }
        )
        } 
}


    render(){
        const formItemLayout = {labelCol: {span: 4}, wrapperCol: {span: 18}}
        return (
            <div>
               <h1>添加商品</h1>
               <Form {...formItemLayout}
                          size='large'
                          onFinish={this.submitInfo}
                          ref={this.formRef}
                          name='form'>
                   <Form.Item label='名称' name='name'>
                       <Input/>
                   </Form.Item>
                   <Form.Item label='价格' name='price'>
                       <InputNumber/>
                   </Form.Item>
                   <Form.Item label='单位' name='unit'>
                       <Input/>
                   </Form.Item>
                   <Form.Item label='图片' name='url'>
                       <Input/>
                   </Form.Item>
                   <Form.Item>
                       <Button type="primary" htmlType="submit">提交</Button>
                   </Form.Item>
               </Form>
            </div>
        )
    }
}
export default AddProduct;