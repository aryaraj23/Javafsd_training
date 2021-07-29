import React from 'react';
import { ReactDOM } from 'react';
import logo from './logo.svg';
import './App.css';

class Clock extends React.Component {
  render() {
    return (
      <div>
        <h1>Hello, world!</h1>
        <h2>It is {this.props.date.toLocaleTimeString()}.</h2>
      </div>
    );
  }
}
function tick() {
  <App />,
  ReactDOM.render(
    <Clock date = {new Date()} />,
    document.getElementById('root')
  );
}

setInterval(tick,1000);
export default App;
