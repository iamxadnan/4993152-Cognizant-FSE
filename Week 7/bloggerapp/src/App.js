import './index.css';
import React from 'react';
import { books } from './Data';

function App() {
  const courseList = [
    { cname: 'Angular', date: '4/5/2021' },
    { cname: 'React', date: '6/3/20201' }
  ];

  const blogPosts = [
    {
      title: 'React Learning',
      author: 'Adnan ',
      content: 'Welcome to learning React!'
    },
    {
      title: 'Installation',
      author: 'Shariff',
      content: 'You can install React from npm.'
    }
  ];

  const coursedet = courseList.length > 0 ? (
    <ul>
      {courseList.map((c, i) => (
        <li key={i}>
          <h3>{c.cname}</h3>
          <h4>{c.date}</h4>
        </li>
      ))}
    </ul>
  ) : <p>No courses available</p>;

  const content = blogPosts.length ? (
    <ul>
      {blogPosts.map((post, index) => (
        <li key={index}>
          <h2>{post.title}</h2>
          <h4>{post.author}</h4>
          <p>{post.content}</p>
        </li>
      ))}
    </ul>
  ) : <p>No blogs to display</p>;

  const bookdet = (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'center' }}>
        <div className="mystyle">
          <h1>Course Details</h1>
          {coursedet}
        </div>

        <div className="st2">
          <h1>Book Details</h1>
          {bookdet}
        </div>

        <div className="v1">
          <h1>Blog Details</h1>
          {content}
        </div>
      </div>
    </div>
  );
}

export default App;
