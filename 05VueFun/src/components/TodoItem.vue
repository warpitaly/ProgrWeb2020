<template>
  <div class="todo-item" :class="{ 'is-complete': todo.completed }">
    <p>
      <input type="checkbox" @change="markCompleted" :checked="todo.completed" />
      {{ todo.id }} - {{ todo.title }}
      <button class="del" @click="$emit('del-todo',todo.id)" >x</button>
    </p>
  </div>
</template>

<script>
export default {
  name: "TodoItem",
  props: ["todo"],
  methods:{
      markCompleted(){
          console.log(this.todo.id);
          this.todo.completed = !this.todo.completed;
      }
  }
};
</script>

<style>
.todo-item {
  background: #f4f4f4;
  padding: 10px;
  border-bottom: 1px #ccc dotted;
}
.is-complete {
  text-decoration: line-through;
}
.del {
  background: #ff0000;
  color: #fff;
  border: none;
  padding: 5px 9px;
  border-radius: 50%;
  cursor: pointer;
  float: right;
}
</style>
