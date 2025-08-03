import React from 'react'

function Greeting(p){
  if(p.logged){
    return <h1>Welcome back</h1>
  }
  else{
    return <h1>Please sign up.</h1>
  }
}

export default Greeting
