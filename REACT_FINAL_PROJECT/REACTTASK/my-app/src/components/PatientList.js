import React from 'react';
import Patient from './Patient';

const PatientList = ({ patients }) => {
  return (
    <div className="mt-3">
      <h2>Patient List</h2>
      <ul className="list-group">
        {patients.map(patient => (
          <Patient key={patient.id} patient={patient} />
        ))}
      </ul>
    </div>
  );
};

export default PatientList;
