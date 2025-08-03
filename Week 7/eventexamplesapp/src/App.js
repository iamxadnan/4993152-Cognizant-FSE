import './App.css';
import CurrencyConvertor from './CurrencyConverter';
import React, { useState } from 'react';

function App() {
  const [num, setNum] = useState(1);

  function increase() {
    setNum(num + 1);
    sayHello();
  }

  function sayHello() {
    alert("Hello! You just clicked increment");
  }

  function decrease() {
    setNum(num - 1);
  }

  function sayMsg(msg) {
    alert(msg)
  }

  function clicked(e) {
    alert("I was clicked")
  }

  return (
    <div>
      <h3>{num}</h3>
      <button onClick={increase}>Increment</button>
      <br/><br/>
      <button onClick={decrease}>Decrement</button>
      <br/><br/>
      <button onClick={() => sayMsg("Welcome")}>Say welcome</button>
      <br/><br/>
      <button onClick={(e)=>clicked(e)}>Click on me</button>

      <CurrencyConvertor />
    </div>
  );
}

export default App;
