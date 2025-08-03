import React, { useState } from "react";

function CurrencyConvertor(){
  const [amt,setAmt] = useState("");
  const [cur,setCur] = useState("");

  function handleSubmit(e){
    e.preventDefault();
    let rupees = amt * 80; 
    alert("Converting to: "+cur+" Amount is ₹"+rupees);
  }

  return (
    <div>
      <h2 style={{color:'green'}}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount: </label>
        <input type="text" value={amt} onChange={(e)=>setAmt(e.target.value)}/>
        <br/>
        <label>Currency: </label>
        <input type="text" value={cur} onChange={(e)=>setCur(e.target.value)} />
        <br/>
        <button type="submit">Submit</button>
      </form>
    </div>
  )
}

export default CurrencyConvertor;
