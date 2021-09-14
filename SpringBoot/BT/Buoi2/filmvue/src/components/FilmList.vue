<template>
    <ul id="array-rendering">
		<li v-for="(film, index) in films" :key="index" :film="film">
            {{film.filmName +" - "+film.directorName+" - "+film.year}}
        </li>
    </ul>
</template>

<script>
export default {
  props: {
    films: {
      type: Array,
      required: true,
    },
  },
};
</script>

<style>
a {
  color: #42b983;
}
</style>