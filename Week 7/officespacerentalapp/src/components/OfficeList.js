import React from "react"

function OfficeList(){

  let data=[
    {Name:"DBS",Rent:50000,Address:"Chennai",image:"https://cdn.sanity.io/images/uqxwe2qj/production/62db3c671745e98cb27690dff96f8033d2bb7f35-2048x1010.jpg"},
    {Name:"WeWork",Rent:75000,Address:"Bangalore",image:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWUUohOkLcDHwR9vFyhioPaRUVovY1ozLXjp9i13pDG0AxYiAg5zZ32Jc5pPEcTp_Nb8E&usqp=CAU"},
    {Name:"SmartWorks",Rent:60000,Address:"Mumbai",image:"https://assets.architecturaldigest.in/photos/600826dc1363405bf8eb5135/4:3/w_1024,h_768,c_limit/DSC_1374-1366x768.jpg"}
  ]

  return(
    <div style={{textAlign:"center"}}>
      {
        data.map((i,n)=>{
          let colors=[]
          if(i.Rent<=60000){
            colors.push("red")
          }
          else{
            colors.push("green")
          }

          return(
            <div key={n}>
              <img src={i.image} width="25%" height="25%" />
              <h2>Name: {i.Name}</h2>
              <h3 style={{color:colors[0]}}>Rent: Rs. {i.Rent}</h3>
              <h3>Address: {i.Address}</h3>
              <hr/>
            </div>
          )
        })
      }
    </div>
  )
}

export default OfficeList
