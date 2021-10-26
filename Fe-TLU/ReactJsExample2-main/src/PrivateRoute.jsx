/* eslint react/prop-types: 0 */
import React from 'react';
import PropTypes from 'prop-types';
import { Route } from 'react-router-dom';
import StorageUtils from './helpers/StorageUtils';
import Login from "./containers/login/Login";

const PrivateRoute = ({ component: Component, ...rest }) => {
  const hasToken = StorageUtils.getToken();
  return (
    <Route
      {...rest}
      render={
        props => (hasToken
          ? (<Component {...props} />)
          : (<Login {...props} />))
      }
    />
  );
};

PrivateRoute.propTypes = {
  component: PropTypes.func.isRequired,
};

export default PrivateRoute;
