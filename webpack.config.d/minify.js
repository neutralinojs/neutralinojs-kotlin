if (defined.PRODUCTION) {
    const TerserPlugin = require('terser-webpack-plugin');

    config.optimization = {
        minimize: true,
        minimizer: [
            new TerserPlugin({
                parallel: true,
                terserOptions: {
                    ecma: 6
                }
            })
        ]
    };
}