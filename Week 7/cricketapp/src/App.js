import './App.css';
import ListofPlayers from './components/ListOfPlayers'
import IndianPlayers from './components/IndianPlayers'

function App() {

  let flag=true; // change this to false to see Indian Players

  return (
    <div>
      <h1>My Cricket App</h1>
      {
        flag ? <ListofPlayers/> : <IndianPlayers/>
      }
    </div>
  );
}

export default App;
