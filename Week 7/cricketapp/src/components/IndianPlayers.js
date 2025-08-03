import React from "react"

function IndianPlayers(){

  let odd = ["Virat","Rahul","Hardik","Pant","Gill"]
  let even = ["Rohit","Bumrah","Jadeja","Siraj","Surya"]

  let [a,b,...c]=odd
  let [x,y,...z]=even

  let t20 = ["Virat","Rohit","Pant"]
  let ranji = ["Pujara","Rahane","Dhawan"]
  let merged = [...t20,...ranji]

  return(
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{a}</li>
        <li>{b}</li>
        {
          c.map((p,i)=><li key={i}>{p}</li>)
        }
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{x}</li>
        <li>{y}</li>
        {
          z.map((p,i)=><li key={i}>{p}</li>)
        }
      </ul>

      <h2>Merged Players</h2>
      <ul>
        {
          merged.map((m,i)=><li key={i}>{m}</li>)
        }
      </ul>
    </div>
  )
}

export default IndianPlayers
