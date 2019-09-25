var vue = new Vue({
    el:"#dataList",
    data:{
        userList:[]
    },
    methods:{
       findAll:function(){
           var _this = this;
            axios.get("/Day01_war/user/findAll.do").then(function (response) {
                _this.userList = response.data;
            })
       }
    },
    created(){
        this.findAll();
    }
});