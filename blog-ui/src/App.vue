<template>

  <body>
  <div style="background-color:lightgreen">
    <!--上部分-->
    <div>
      <img alt="Vue logo" class="logo" height="125" src="@/assets/github-profile.jpg" style="" width="125"/>
    </div>
    <!--下部分-->
    <div style="height:530px;text-align:center">
      <button @click="intelligRoad()">技术之路</button>
      <button>文章生活</button>
    </div>
  </div>
  </body>
</template>


<script>
import axios from 'axios'

export default {
  data() {

  },
  methods: {
    intelligRoad() {
      // 创建一个自定义的Axios对象
      const axiosObj = axios.create({
        baseURL: 'http://127.0.0.1:8091',
        timeout: 3000,
        /*也可以不设置Content-Type，影响是在你发送请求时
        Vue会先发送OPTIONS包探测路由是否存在，需要后端也做设置响应OPTIONS
        方法，否则会报跨域错误；我这里用的Beego2，路由里不响应OPTIONS方法，
        所以我在这块设置Content-Type*/
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded'
        },
        /*这个配置很重要，允许axios携带用户Cookie到后端，不设置这个的话
        Set-Cookie是无效的,除此之外,Chrome默认开启了SameSite检查，如果
        后端不主动设置SameSite = none,Set-Cookie是无效的*/
        // withCredentials: true
      });
      axiosObj.get('/article/list')
          .then(res => {
            res.data
            debugger
          })
      // .catch(function (error) {
      // console.log(error);
      // });
    }
  }
}
</script>

<style scoped>
.div {
  background-color: aquamarine;
  width: 400px;
  height: 200px;
  display: flex; /*����Ϊ���Ժ�������*/
}

.logo {
  width: 100px;
  height: auto;
  aspect-ratio: 1/1; /*�̶����߱�*/
  display: block; /*����Ϊ�鼶Ԫ��*/
  margin: auto;
}

</style>
