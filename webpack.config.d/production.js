// All configs inside of this file will be enabled only in the production mode.
// The result webpack configurations file will be generated inside ../build/js/packages/<project-name>
// To check the outputs of this config, see ../build/distributions
if (config.mode == "production") {

  const HtmlWebpackPlugin = require("html-webpack-plugin"),
    TerserWebpackPlugin = require("terser-webpack-plugin");

  // Where to output and how to name JS sources.
  // Using hashes for correct caching.
  // The index.html will be updated correspondingly to refer the compiled JS sources.
  config.output.filename = "js/[name].[contenthash].js";

  // Making sure optimization and minimizer configs exist, or accessing its properties can crash otherwise.
  config.optimization = config.optimization || {};
  config.optimization.splitChunks = config.optimization.splitChunks || {};
  config.optimization.splitChunks.chunks = "all";
  config.optimization.splitChunks.maxSize = 100000;

  config.optimization.minimize = true;
  const minimizer = config.optimization.minimizer = config.optimization.minimizer || [];

  // Minifying HTML.
  minimizer.push(new HtmlWebpackPlugin({
    template: "./kotlin/index.html",
    minify: {
      collapseWhitespace: true,
      keepClosingSlash: true,
      removeComments: true,
      removeRedundantAttributes: true,
      removeScriptTypeAttributes: true,
      removeStyleLinkTypeAttributes: true,
      useShortDoctype: true,
    },
  }));

  // Additional JS minification.
  minimizer.push(new TerserWebpackPlugin({
    parallel: true,   // speeds up the compilation
    extractComments: true, // excluding all comments (mostly licence-related ones) into a separate file
    minify: TerserWebpackPlugin.swcMinify,
  }));

}
