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
      <br/>
      <Card style="width:100%">
        <List border footer="Footer" header="Header" size="large">
          <div v-for="item in listItem">
            <ListItem>{{ item.title }}</ListItem>
          </div>
        </List>

        <Page
            :model-value="this.page.current"
            :page-size="this.page.size"
            :total="this.page.total"
            next-text="下一页"
            prev-text="上一页"/>
      </Card>
    </div>

  </div>
  </body>
</template>


<script>
import axios from 'axios'

export default {
  data() {
    return {
      listItem: [],
      page: {
        total: 0,
        size: 0,
        current: 0
      }
    }
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
            let iPage = res.data.iPage
            if (res.data && iPage.records.length > 0) {
              this.listItem = iPage.records
              this.page.total = iPage
              this.page.size = iPage
              this.page.current = iPage
            }

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
  display: flex;
}

.logo {
  width: 100px;
  height: auto;
  aspect-ratio: 1/1;
  display: block;
  margin: auto;
}

.rate-demo {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

</style>
