import './index.css'
import Greeting from './Greetings'
import React,{useState} from 'react'

function App(){

  const [isLogged,setIsLogged]=useState(false)

function loginNow(){
  setIsLogged(true)
  }

  function logoutNow(){
    setIsLogged(false)
  }

  return(
    <div>
      <Greeting logged={isLogged} />
      {
        isLogged ? 
        <button onClick={logoutNow}>Logout</button> : 
        <button onClick={loginNow}>Login</button>
      }
  </div>
  )
}

export default App
