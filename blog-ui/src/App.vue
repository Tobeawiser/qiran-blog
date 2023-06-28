<template>

  <body>
  <div style="background-color:lightgreen">
    <!--上部分-->
    <div>
      <img alt="Vue logo" class="logo" height="125" src="@/assets/github-profile.jpg" style="" width="125"/>
    </div>
    <!--下部分-->
    <div style="height:530px;text-align:center">
      <button @click="intelligRoad('compute')">技术之路</button>
      <button @click="intelligRoad('life')">文章生活</button>
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
    intelligRoad(param) {
      // 创建一个自定义的Axios对象
      const axiosObj = axios.create({
        baseURL: 'http://127.0.0.1:8091',
        timeout: 3000,
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded'
        },
      });
      axiosObj.get('/article/list')
          .then(res => {
            res.data
            debugger
          })
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
