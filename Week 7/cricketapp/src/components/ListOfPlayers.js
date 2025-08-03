import React from "react"

function ListofPlayers(){

  let players = [
    {name:"Virat",score:90},
    {name:"Rohit",score:70},
    {name:"Rahul",score:65},
    {name:"Pant",score:55},
    {name:"Gill",score:85},
    {name:"Surya",score:40},
    {name:"Iyer",score:75},
    {name:"Bumrah",score:60},
    {name:"Siraj",score:50},
    {name:"Jadeja",score:95},
    {name:"Ishan",score:45}
  ]

  let below70 = players.filter(p=>p.score<70)

  return(
    <div>
      <h2>All Players</h2>
      <ul>
        {
          players.map((p,ind)=><li key={ind}>{p.name} - {p.score}</li>)
        }
      </ul>
      <h2>Players below 70</h2>
      <ul>
        {
          below70.map((p,ind)=><li key={ind}>{p.name} - {p.score}</li>)
        }
      </ul>
    </div>
  )
}

export default ListofPlayers;