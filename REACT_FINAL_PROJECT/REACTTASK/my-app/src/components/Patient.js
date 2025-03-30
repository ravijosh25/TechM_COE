import React from 'react';

const Patient = ({ patient }) => {
  return (
    <li className="list-group-item">
      <h5>{patient.name} (Age: {patient.age})</h5>
      <p><strong>Ailment:</strong> {patient.ailment}</p>
    </li>
  );
};

export default Patient;
