<template>
  <div id="app">
     <Header>TodoList</Header>
     <Todos v-bind:todos="todos" @del-todo="deleteTodo"/>
  </div>
</template>

<script>
import Header from "./components/layout/Header"
import Todos from "./components/Todos"


export default {
  name: "App",
  components: {
    Header,
    Todos
  },
  data(){
    return {
      msg: "Ciao, mondo!!",
      todos: [
        {
          id: 1,
          title: "Compra carne",
          completed: false
        },
        {
          id: 2,
          title: "Annaffia le piante",
          completed: true
        },
        {
          id: 3,
          title: "Portare fuori il cane",
          completed: false
        }
      ]
    }
  },
  methods:{
    deleteTodo(id){
      this.todos = this.todos.filter(todo => todo.id !== id);
    }
  }
};
</script>

<style>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
body {
  font-family: Arial, Helvetica, sans-serif;
  line-height: 1.4;
}
</style>
