import React, { Component } from 'react'

export class NewsItem extends Component {
  render() {
    let {title, description, imageUrl, NewsUrl} = this.props;
    return (
      <div className="my-3">
      <div className="card">
      <img src={imageUrl?imageUrl:'https://a4.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1219926_1296x729.jpg'} 
      className="card-img-top" alt="..."/>
      <div className="card-body">
        <h5 className="card-title">{title}...</h5>
        <p className="card-text">{description}...</p>
        <a href={NewsUrl} rel="noreferrer" target="_blank" className="btn btn-sm btn-primary">Read More</a>
      </div>
      </div>
    </div> 

    )
  }
}

export default NewsItem