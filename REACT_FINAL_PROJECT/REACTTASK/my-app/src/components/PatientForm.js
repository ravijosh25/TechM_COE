import React, { useState } from 'react';

const PatientForm = ({ onSubmit }) => {
  const [formData, setFormData] = useState({
    name: '',
    age: '',
    ailment: ''
  });
  const [error, setError] = useState(null);

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (formData.name && formData.age && formData.ailment) {
      onSubmit(formData);
      setFormData({ name: '', age: '', ailment: '' });
      setError(null);
    } else {
      setError('Please fill out all fields.');
    }
  };

  return (
    <div className="container mt-3">
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Name:</label>
          <input
            type="text"
            name="name"
            className="form-control"
            onChange={handleChange}
            value={formData.name}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Age:</label>
          <input
            type="number"
            name="age"
            className="form-control"
            onChange={handleChange}
            value={formData.age}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Ailment:</label>
          <input
            type="text"
            name="ailment"
            className="form-control"
            onChange={handleChange}
            value={formData.ailment}
            required
          />
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>

      {error && (
        <div className="alert alert-danger mt-3">
          {error}
        </div>
      )}
    </div>
  );
};

export default PatientForm;
