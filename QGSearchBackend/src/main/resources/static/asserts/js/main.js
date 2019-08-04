class MainItemList extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            data: null
        }
    }

    handleChange(e) {

        let key = document.getElementById("key_word").value;

        axios.get("/search/" + key).then((response) => {
            this.setState({
                data: response.data.data
            });

            console.log(this.state);
        });
    }


    render(){

        let contentList = [];

        if (this.state.data != null) {
            for (let i = 0; i < this.state.data.length; i++) {

                let list = [];
                for (let j = 0; j < this.state.data[i].choose.length; j++) {
                    list.push(<li>this.state.data[i].choose[j]</li>);
                }

                contentList.push(
                    <section key={this.state.data[i]._id}>
                        <div className="col-lg-12 col-md-12 col-sm-12">
                            <p>
                                {this.state.data[i].content}
                            </p>
                            <ul>
                                {list}
                            </ul>
                        </div>

                    </section>
                );


            }
        }

        return (
            <div className="mainFrame">
                <div className="col-lg-12 col-md-12 col-sm-12">
                    <input type="text" id="key_word" placeholder="输入题目关键词..." onChange={this.handleChange.bind(this)} name="" />
                </div>

                <main>
                    {contentList}
                </main>
            </div>
        );
    }
}

ReactDOM.render(<MainItemList />, document.getElementById("main"));
