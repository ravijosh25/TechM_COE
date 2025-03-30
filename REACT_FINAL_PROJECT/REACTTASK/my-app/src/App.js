import React, { useState } from 'react';
import PatientForm from './components/PatientForm';
import PatientList from './components/PatientList';

function App() {
  const [patients, setPatients] = useState([]);

  const handleFormSubmit = (patientData) => {
    setPatients([...patients, { id: patients.length + 1, ...patientData }]);
  };

  return (
    <div className="App">
      <div className="container">
        <h1 className="my-4">Patient Data Management</h1>
        <PatientForm onSubmit={handleFormSubmit} />
        <PatientList patients={patients} />
      </div>
    </div>
  );
}

export default App;
